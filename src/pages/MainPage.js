import React from 'react'
import room1 from '../assets/img/room1.jpg'
import '../assets/css/mainPageCSS.css';


export default function MainPage(){
    return(
        <div >
            <img className='test' src={room1} alt="이미지"/>
        </div>
    )
}