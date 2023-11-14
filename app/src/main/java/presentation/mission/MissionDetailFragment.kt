package presentation.mission

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tome_aos.R
import com.example.tome_aos.databinding.FragmentMissionBinding
import com.example.tome_aos.databinding.FragmentMissionDetailBinding
import kotlinx.coroutines.flow.combine
import presentation.MainActivity
import presentation.mission.camera.GalleryActivity
import presentation.mission.decibel.MissionDecibelFragment
import presentation.mission.text.MissionTextFragment


class MissionDetailFragment : Fragment() {
    private lateinit var binding: FragmentMissionDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMissionDetailBinding.inflate(inflater, container, false)

        val mainActivity = activity as MainActivity
        mainActivity.hideBottomNavigation(true)

        val missionFragment = MissionFragment()
        val missionTextFragment = MissionTextFragment()
        val missionDecibelFragment = MissionDecibelFragment()
        val transaction = parentFragmentManager.beginTransaction()

        binding.goMissionBtn.setOnClickListener {
            //transaction.replace(R.id.main_frameLayout, missionTextFragment)
//            transaction.replace(R.id.main_frameLayout, missionDecibelFragment)
//            transaction.commit()

        }

        binding.backMissionBtn.setOnClickListener {
            transaction.replace(R.id.main_frameLayout, missionFragment)
            transaction.commit()
        }
        return binding.root
    }

}