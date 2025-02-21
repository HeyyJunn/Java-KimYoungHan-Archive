import './App.css'
import MyPage from "./MyPage/MyPage.jsx";
import { useState } from "react";

function App() {
  // 사용자 정보 상태 관리

  const [userInfo, setUserInfo] = useState({
    id: "TempId1234",
    name: "임시이름",
    studentId: "60240000",
    password: "TempPassword1234",
    entryYear: "24",
  });

  return (
    <div>
        <MyPage userInfo={userInfo} setUserInfo={setUserInfo} />
    </div>
  );
}

export default App;