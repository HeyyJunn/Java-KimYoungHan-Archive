import './ProfileHeader.css';
import { useState } from 'react';
import defaultProfileImage from '../image/project_basicprofile.png';
import editIcon from '../image/project_profileedit.png';

const ProfileHeader = ({ userInfo }) => {
  const [profileImage, setProfileImage] = useState(defaultProfileImage); // 기본 이미지 적용

  const handleImageChange = (event) => {
    const file = event.target.files[0];
    if (file) {
      const imageUrl = URL.createObjectURL(file);
      setProfileImage(imageUrl);
    }
  };

  return (
    <div className='ProfileHeader'>
      <div className='ProfileContainer'>
        <img src={profileImage} alt="PROFILE" className='ProfileImage' />

        {/* 수정 버튼 */}
        <label className='EditIcon'>
          <img src={editIcon} alt="EDIT" />
          <input type="file" accept="image/*" onChange={handleImageChange} />
        </label>
      </div>

      <h2>{userInfo.name}</h2>
      <h4>{userInfo.entryYear}학번</h4>
    </div>
  );
};

export default ProfileHeader;