import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

import Nowbook from './pages/Nowbook';
import MainPage from './pages/MainPage';

import RoomNoticePage from './pages/RoomNoticePage';
import DoReserve from './pages/DoReserve';
import AdminPage from './pages/AdminPage';
import AdminDeletePage from './pages/AdminDeletePage';
import AdminPostPage from './pages/AdminPostPage';
import Header from './components/Header';



export default function App() {
  return (
    <>
      <BrowserRouter>
      <Routes>
        {/* 메인 페이지 */}
        <Route path="/" element={<MainPage />} />

        {/* 예약 현황 */}
        <Route path="/cal" element={<Nowbook />} />

        {/* 합주실 공지 */}
        <Route path="/notice" element={<RoomNoticePage/>} />

        {/* 예약 하기 */}
        <Route path="/book" element={<DoReserve/>}/>

        {/* 어드민 메인 페이지 */}
        <Route path="/admin/selectMenu" element={<AdminPage/>}/>

        {/* 신청된 예약 관리 페이지 */}
        <Route path='/admin/postuser' element={<AdminPostPage/>}/>

        {/* 최종완료된 예약 삭제 페이지 */}
        <Route path='/admin/deleteuser' element={<AdminDeletePage/>}/>
      </Routes>
    </BrowserRouter>
    </>
    
  );
}
