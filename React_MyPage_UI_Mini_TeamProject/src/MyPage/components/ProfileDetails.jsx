import './ProfileDetails.css';
import { useState } from 'react';
import iconId from '../image/project_id.png';
import iconStudentNum from '../image/project_studentnum.png';
import iconPassword from '../image/project_password.png';

const PasswordChangeModal = ({ onClose, userInfo, setUserInfo }) => {
  const [passwordInputs, setPasswordInputs] = useState({
    currentPassword: "",
    newPassword: "",
    confirmPassword: "",
  });

  const handleInputChange = (event) => {
    const { name, value } = event.target;
    setPasswordInputs({ ...passwordInputs, [name]: value });
  };

  // gpt
  const validatePassword = (password) => {
    const lengthCheck = password.length >= 6 && password.length <= 20;
    const specialCharCheck = /[!@#$%^&*(),.?":{}|<>]/.test(password);
    const uppercaseCheck = /[A-Z]/.test(password);
    return lengthCheck && specialCharCheck && uppercaseCheck;
  };

  const handleChangePassword = () => {
    if (passwordInputs.currentPassword !== userInfo.password) {
      alert("현재 비밀번호가 일치하지 않습니다.");
      return;
    }
    if (!validatePassword(passwordInputs.newPassword)) {
      alert("비밀번호는 6~20자이며, 최소 1개의 대문자와 1개의 특수문자를 포함해야 합니다.");
      return;
    }
    if (passwordInputs.newPassword !== passwordInputs.confirmPassword) {
      alert("새 비밀번호가 일치하지 않습니다.");
      return;
    }

    setUserInfo({ ...userInfo, password: passwordInputs.newPassword });
    alert("비밀번호 변경 성공!");
    onClose(); // 모달 닫기
  };

  return (
    <div className="modal-overlay" onClick={onClose}>
      <div className="modal-content" onClick={(e) => e.stopPropagation()}>
        <h3>비밀번호 변경</h3>
        <input type="password" name="currentPassword" placeholder="기존 비밀번호" onChange={handleInputChange} />
        <input type="password" name="newPassword" placeholder="새 비밀번호" onChange={handleInputChange} />
        <input type="password" name="confirmPassword" placeholder="새 비밀번호 확인" onChange={handleInputChange} />
        <button className="change-btn" onClick={handleChangePassword}>변경하기</button>
      </div>
    </div>
  );
};

const ProfileWrapper = ({ icon, label, content, showButton, setIsModalOpen }) => {
  return (
    <div className='ProfileWrapper'>
      <img src={icon} alt={`${label} icon`} className='ProfileIcon' />
      <div className="ProfileText">{content}</div>
      {showButton && <button className='ChangePasswordButton' onClick={() => setIsModalOpen(true)}>변경</button>}
    </div>
  );
};

const ProfileDetails = ({ userInfo, setUserInfo }) => {
  const [isModalOpen, setIsModalOpen] = useState(false);

  return (
    <div className='ProfileDetails'>
      <div className='Head'>
        <h3>프로필</h3>
      </div>

      {/* 아이디 & 학번: `userInfo`에서 직접 가져오기 */}
      <ProfileWrapper icon={iconId} label="Id" content={userInfo.id} />
      <ProfileWrapper icon={iconStudentNum} label="Student Number" content={userInfo.studentId} />

      {/* 비밀번호: 변경 가능하도록 버튼 추가 */}
      <ProfileWrapper
        icon={iconPassword}
        label="Password"
        content="비밀번호"
        showButton={true}
        setIsModalOpen={setIsModalOpen}
      />

      {/* 모달이 열렸을 때만 렌더링 */}
      {isModalOpen && <PasswordChangeModal onClose={() => setIsModalOpen(false)} userInfo={userInfo} setUserInfo={setUserInfo} />}
    </div>
  );
};

export default ProfileDetails;