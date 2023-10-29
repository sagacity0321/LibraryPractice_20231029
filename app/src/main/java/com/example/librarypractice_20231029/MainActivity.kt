package com.example.librarypractice_20231029

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.librarypractice_20231029.databinding.ActivityMainBinding

// 1st Party: 제조사 == 제작사(닌스-슈퍼마리오)
// 2nd Party: 제조사, 제작사 협력 관계(남코-철권)
// 3rd Party: 제조사, 제작사와 아무 관련 없는 외부 업체 / 비협력 관계(스팀-게임)

// 10.2.13: 버전 네임
// 10: 메이저 버전 - 대격변 수준으로 갈아 엎은 경우
// 2: 마이너 버전 - 기능 추가 및 변경이 있었지만, 기존 기능에는 영향이 없는 경우
// 13: 패치 버전 - 기존 기능에 문제가 있어서 수정한 경우

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.imgProfile.setOnClickListener {
            // 이미지뷰 클릭 이벤트 지원
            val myIntent = Intent(this, ViewPhotoActivity::class.java)
            startActivity(myIntent)

        }
    }
}