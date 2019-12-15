import React, {useCallback} from 'react'
import {useDropzone} from 'react-dropzone'

function MyDropzone() {
  const onDrop = useCallback(acceptedFiles => {
    fetch("http://localhost:8080/api/v1/prices/parse/", {
                method: 'post',
                body: JSON.stringify(acceptedFiles)})
                .then(res => res.json())
                .then(data => {
//                    this.setState({ perfumes: data });
                        console.log(data);
                })
                .catch(console.log);
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

export default MyDropZone;