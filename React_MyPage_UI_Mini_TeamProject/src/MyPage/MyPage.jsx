import './MyPage.css'
import LogoutButton from "./components/LogoutButton"; 
import ProfileDetails from "./components/ProfileDetails"; 
import ProfileHeader from "./components/ProfileHeader"; 
import projectMapLogo from "./image/project_maplogo.png";

function MyPage ({ userInfo, setUserInfo }) {

  return (
    <div className='MyPage'>
      <div className='LogoWrapper'>
      <img 
        src={projectMapLogo} 
        alt="MAP Logo" 
        className="maplogo-png" 
      />
      </div>

      <ProfileHeader 
        userInfo={userInfo}
      />
      <ProfileDetails 
        userInfo={userInfo} 
        setUserInfo={setUserInfo}
      />
      <LogoutButton />
    </div>
  )
}

export default MyPage;