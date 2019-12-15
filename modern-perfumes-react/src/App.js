import React, { useCallback } from "react";
import logo from "./logo.svg";
import "./App.css";
//import ParseExcel from './components/ParseExcel';
//import MyDropZone from './components/common/MyDropZone';
import Dropzone, { useDropzone } from "react-dropzone";

function uploadFiles(files) {
    const formData = new FormData();
    formData.append('file', files[0]);
     fetch('http://localhost:8080/api/v1/prices/parse', {
                method: 'post',
                body: formData
            }).then(res => {
                if(res.ok) {
                    console.log(res.data);
                    alert("File uploaded successfully.")
                }
            });
}

function App() {
  const onDrop = useCallback(acceptedFiles => {
      uploadFiles(acceptedFiles);
    }, [])
    const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})

    return (
      <div {...getRootProps()}>
        <input {...getInputProps()} />
        {
          isDragActive ?
            <p>Drop the files here ...</p> :
            <p>Drag 'n' drop some files here, or click to select files</p>
        }
      </div>
    )
}


export default App;
