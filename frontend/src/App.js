import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

import Nowbook from './pages/Nowbook';
import MainPage from './pages/MainPage';

import RoomNoticePage from './pages/RoomNoticePage';
import TestMoviePage from './pages/TestMoviePage';
import AdminPage from './pages/AdminPage';


export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<MainPage />} />
        <Route path="/cal" element={<Nowbook />} />
        <Route path="/notice" element={<RoomNoticePage/>} />
        <Route path="/book" element={<TestMoviePage/>}/>
        <Route path='/admin/users' element={<AdminPage/>}/>
        
      </Routes>
    </BrowserRouter>
  );
}
