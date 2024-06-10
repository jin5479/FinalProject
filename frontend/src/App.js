import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

import Nowbook from './pages/Nowbook';
import MainPage from './pages/MainPage';

import RoomNoticePage from './pages/RoomNoticePage';
import TestMoviePage from './pages/TestMoviePage';


export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<MainPage />} />
        <Route path="/cal" element={<Nowbook />} />
        <Route path="/notice" element={<RoomNoticePage/>} />
        <Route path="/book" element={<TestMoviePage/>}/>
        
      </Routes>
    </BrowserRouter>
  );
}
