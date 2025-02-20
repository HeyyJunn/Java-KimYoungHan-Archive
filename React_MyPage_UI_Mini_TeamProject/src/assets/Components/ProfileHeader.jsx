import './ProfileHeader.css'
import { useState } from 'react';
const ProfileHeader = ({name="임시이름", entryYear="24"}) => {
  const [profileImage, setProfileImage] = useState('/project_basicprofile.png');

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
          <img src='/project_profileedit.png' alt="EDIT" />
          <input type="file" accept="image/*" onChange={handleImageChange} />
        </label>
      </div>

      {/* <h2>{name}</h2>
      <h4>{entryYear}</h4> */}
      <h2>{name}</h2>
      <h4>{entryYear}학번</h4>

    </div>
  )
};

export default ProfileHeader;