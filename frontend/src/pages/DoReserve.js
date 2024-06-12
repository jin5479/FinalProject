import { useEffect, useState } from "react";

import axios from 'axios';
import { redirect } from "react-router-dom";
const baseURL = process.env.REACT_APP_SERVER
const apiUrl = `${baseURL}`;

function DoReserve() {
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

    alert('예약 신청이 완료되었습니다!');
    window.location.href = '/';
  };

  

  return (
    <div>
        <h1>예약 하기</h1>
        <form onSubmit={handleSubmit}>
            <div>
                <label>이름(사용시간):</label>
                <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} placeholder="홍길동(11:00-13:00)" required/>
            </div>

            <div>
                <label>원하는 이용 날짜(yyyy-mm-dd):</label>
                <input type="text" value={date} onChange={(e) => setDate(e.target.value)} placeholder="2024-08-08" required/>
            </div>

            <button type="submit">신청하기</button>
        </form>

    </div>
);


 
}
export default DoReserve;
