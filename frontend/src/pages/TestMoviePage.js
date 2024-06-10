import { useEffect, useState } from "react";

import axios from 'axios';
const baseURL = process.env.REACT_APP_SERVER
const apiUrl = `${baseURL}`;

function TestMoviePage() {
  const [username, setUsername] = useState('');
  const [phone,setPhone] = useState('');
  const [starttime,setStarttime] = useState('');
  const [endtime,setEndtime] = useState('');
  

  const handleSubmit = async(e) =>{
    e.preventDefault();

    const createUser = {username, phone, starttime, endtime};

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
                <label>phone:</label>
                <input type="text" value={phone} onChange={(e) => setPhone(e.target.value)} />
            </div>

            <div>
                <label>startTime:</label>
                <input type="text" value={starttime} onChange={(e) => setStarttime(e.target.value)} />
            </div>
            <div>
                <label>endTime:</label>
                <input type="text" value={endtime} onChange={(e) => setEndtime(e.target.value)} />
            </div>
            <button type="submit">Submit</button>
        </form>

    </div>
);


 
}
export default TestMoviePage;
