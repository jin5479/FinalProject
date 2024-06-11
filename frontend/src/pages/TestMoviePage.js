import { useEffect, useState } from "react";

import axios from 'axios';
const baseURL = process.env.REACT_APP_SERVER
const apiUrl = `${baseURL}`;

function TestMoviePage() {
  const [username, setUsername] = useState('');
  const [date,setDate] = useState('');
  // const [starttime,setStarttime] = useState('');
  // const [endtime,setEndtime] = useState('');
  

  const handleSubmit = async(e) =>{
    e.preventDefault();

    const createUser = {username, date};

    try{
      const response = await axios.post(`${apiUrl}`+"/reservation",createUser)
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
                <label>username:</label>
                <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} />
            </div>

            <div>
                <label>date:</label>
                <input type="text" value={date} onChange={(e) => setDate(e.target.value)} />
            </div>

            <button type="submit">Submit</button>
        </form>

    </div>
);


 
}
export default TestMoviePage;
