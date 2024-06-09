import { useEffect, useState } from "react";

import axios from 'axios';
const baseURL = process.env.REACT_APP_SERVER
const apiUrl = `${baseURL}`;

function TestMoviePage() {
  const [title, setTitle] = useState('');
  const [image,setImage] = useState('');
  const [content,setContent] = useState('');

  const handleSubmit = async(e) =>{
    e.preventDefault();

    const movie = {title,image,content};

    try{
      const response = await axios.post(`${apiUrl}`+"/movie",movie)
      console.log('user created',response.data);
    } catch (error){
      console.error('error!!',error);
    }
  };

  

  return (
    <div>
        <h1>Create User</h1>
        <form onSubmit={handleSubmit}>
            <div>
                <label>Name:</label>
                <input type="text" value={title} onChange={(e) => setTitle(e.target.value)} />
            </div>

            <div>
                <label>image:</label>
                <input type="text" value={image} onChange={(e) => setImage(e.target.value)} />
            </div>

            <div>
                <label>content:</label>
                <input type="text" value={content} onChange={(e) => setContent(e.target.value)} />
            </div>
            <button type="submit">Submit</button>
        </form>

    </div>
);


 
}
export default TestMoviePage;
