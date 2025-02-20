import './MyPage.css'
import LogoutButton from './assets/Components/LogoutButton';
import ProfileDetails from './assets/Components/ProfileDetails';
import ProfileHeader from './assets/Components/ProfileHeader';
import { useState, useRef } from 'react'

// props 미구현, App.jsx 에서 받아와야함
function MyPage () {

  return (
    <div className='MyPage'>
      <div className='LogoWrapper'>
      <img src='/project_maplogo.png' alt="MAP Logo" className='maplogo-png'></img>
      </div>
      <ProfileHeader />
      <ProfileDetails />
      <LogoutButton />
    </div>
  )
}

export default MyPage;