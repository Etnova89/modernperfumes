import React, {useCallback} from 'react';
import logo from './logo.svg';
import './App.css';
//import ParseExcel from './components/ParseExcel';
//import MyDropZone from './components/common/MyDropZone';
import {useDropzone} from 'react-dropzone'
 
function App() {
//          const onDrop = useCallback((acceptedFiles) => {
//            acceptedFiles.forEach((file) => {
//                debugger;
//                fetch("http://localhost:8080/api/v1/prices/parse/", {
//                    method: 'post',
//                    body: JSON.stringify(acceptedFiles)})
//                    .then(res => res.json())
//                    .then(data => {
//    //                    this.setState({ perfumes: data });
//                            console.log(data);
//                    })
//                    .catch(console.log);
//            })
//
//          }, [])
//          const {getRootProps, getInputProps} = useDropzone({onDrop})
//
//  return (
//    <div className="App">
//
//            <div {...getRootProps()}>
//              <input {...getInputProps()} />
//              <p>Drag 'n' drop some files here, or click to select files</p>
//            </div>
//            </div>
//          )

        return(
            <Dropzone onDrop={acceptedFiles => console.log(acceptedFiles)}>
              {({getRootProps, getInputProps}) => (
                <section>
                  <div {...getRootProps()}>
                    <input {...getInputProps()} />
                    <p>Drag 'n' drop some files here, or click to select files</p>
                  </div>
                </section>
              )}
            </Dropzone>
        )
}

export default App;
