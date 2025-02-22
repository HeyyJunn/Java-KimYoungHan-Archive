import './LogoutButton.css'
import { useNavigate } from 'react-router-dom'
import { useState } from 'react'

const LogoutButton = () => {

  // const navigate = useNavigate();
  // const onClickLogout = () => {
  //   navigate("/");
  // } onClick={onClickLogout}
  // 로그아웃, 탈퇴하기 GPT 사용
  const onClickLogout = () => {
    console.log("로그아웃 버튼이 클릭");
    alert("(App.jsx 미연동) navigate 기능이 아직 구현되지 않았습니다 😭");
  } 
  const onClickDeleteAccount = async () => {
    const confirmDelete = window.confirm("계정을 삭제하시겠습니까? 삭제된 계정은 복구할 수 없습니다."); 
    if (!confirmDelete) return;
    try {
      const response = await fetch("https://api.example.com/delete-account", {
        method: "DELETE",
        headers: { "Content-Type": "application/json" },
        credentials: "include", // 쿠키 기반 로그인 정보 포함 (필요하면)
      });

      if (response.ok) {
        alert("회원 탈퇴가 완료되었습니다.");
        // navigate("/"); // 홈 화면으로 이동
      } else {
        const data = await response.json();
        alert(`회원 탈퇴 실패: ${data.message}`);
      }
    } catch (error) {
      alert("(백엔드 미구현) 회원 탈퇴 중 오류가 발생했습니다.");
      console.error("회원 탈퇴 오류:", error);
    }
  };



  return (
    <div className='LogoutButton'>
      <button onClick={onClickLogout}className='Logout'>
        로그아웃
      </button>
      
      <button onClick={onClickDeleteAccount} className='DeleteId'>
        탈퇴하기
      </button>
    </div>
  )
}

export default LogoutButton;