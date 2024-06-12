import React, { useState } from 'react';
import roomImg from '../assets/img/room1.jpg';
import roomImg2 from '../assets/img/room2.jpg';
import roomImg3 from '../assets/img/room3.jpg';
import '../assets/css/mainPageCSS.css';
import Button from '../components/Button';
import noticeIcon from '../assets/img/noticeIcon.png';
import scheduleIcon from '../assets/img/scheduleIcon.png';
import writeIcon from '../assets/img/writeIcon.png';
import { useNavigate } from "react-router-dom";
import prevIcon from '../assets/img/prevIcon.png'
import nextIcon from '../assets/img/nextIcon.png'
import Header from '../components/Header';

const images = [roomImg, roomImg2, roomImg3];

export default function MainPage() {
    const [currentIndex, setCurrentIndex] = useState(0);
    const navigate = useNavigate();

    const handleMoveLeft = () => {
        setCurrentIndex((prevIndex) => (prevIndex - 1 + images.length) % images.length);
    };

    const handleMoveRight = () => {
        setCurrentIndex((prevIndex) => (prevIndex + 1) % images.length);
    };

    const goToCal = () => {
        navigate("/cal");
    };

    const goToBook=()=>{
        navigate("/book");
    };

    const goToNotice=()=>{
        navigate("/notice");
    }

    const goToAdminLogin=()=>{
        navigate("/admin/login");
    }


    return (
        <>
            <Header/>
            
            <div className='roomContainer'>
                <button onClick={handleMoveLeft} className='moveButton'>
                <img src={prevIcon}alt="이전아이콘"></img>
                </button>
                <div className='imgWrapper'>
                    <img 
                        className='roomImgStyle' 
                        src={images[currentIndex]} 
                        alt="이미지" 
                    />
                </div>
                <button onClick={handleMoveRight} className='moveButton'>
                    <img src={nextIcon}alt="다음아이콘"></img>
                </button>
            </div>

            <div className='noticeContainer'>
                <Button title="이용 관련 안내" img={noticeIcon} onClick={goToNotice} />
                <Button title="예약 현황" img={scheduleIcon} onClick={goToCal} />
                <Button title="예약 하기" img={writeIcon} onClick={goToBook} />
                <button onClick={goToAdminLogin}>예약 관리<br/>관리자 전용</button>
            </div>
        </>
    );
}

