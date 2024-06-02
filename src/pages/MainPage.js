import React from 'react'
import room1 from '../assets/img/room1.jpg'




export default function MainPage(){
    return(
        <div className={styles.imgContainer}>
            <img src={room1} alt="이미지"></img>
        </div>
    );
}
