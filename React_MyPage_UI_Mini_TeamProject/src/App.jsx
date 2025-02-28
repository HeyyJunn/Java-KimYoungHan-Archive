import './App.css'
import MyPage from "./MyPage/MyPage.jsx";
import { useState } from "react";

function App() {
  // 사용자 정보 상태 관리
  const [userInfo, setUserInfo] = useState({
    id: "Temp Id",
    name: "Kim Temp",
    studentId: "60240000",
    password: "TempPassWord1234",
    entryYear: "24",
  });

  return (
    <div>
        <MyPage 
          userInfo={userInfo} 
          setUserInfo={setUserInfo} 
        />
    </div>
  );
}

export default App;