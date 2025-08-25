package onliner.service;

import onliner.dao.mobile.CameraDao;
import onliner.dao.mobile.MobileDao;
import onliner.dao.mobile.ProcessorMobileDao;
import onliner.dao.mobile.ScreenDao;
import onliner.dto.MobileDto;
import onliner.entity.mobile.Camera;
import onliner.entity.mobile.Mobile;
import onliner.entity.mobile.ProcessorMobile;
import onliner.entity.mobile.Screen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class MobileService {
    @Autowired
    private MobileDao mobileDao;
    @Autowired
    private CameraDao cameraDao;
    @Autowired
    private ProcessorMobileDao processorMobileDao;
    @Autowired
    private ScreenDao screenDao;
    @Transactional
    public void save(Mobile mobile) {
        mobileDao.save(mobile);
    }

    @Transactional
    public List<Mobile> getAllMobile(){
        return mobileDao.getAllMobile();
    }

    public Mobile createMobile(MobileDto mobileDto) {
        ProcessorMobile processorMobile;
        Camera camera;
        Screen screen;
        try {
            camera = cameraDao.findByModelCamera(mobileDto.getModelCamera());
        } catch (NoResultException e) {
            camera = new Camera(
                    mobileDto.getModelCamera(),
                    mobileDto.getMainCamera(),
                    mobileDto.getUltraWide(),
                    mobileDto.getTelephoto(),
                    mobileDto.getFrontCamera(),
                    mobileDto.getNumberOfCameraModules());
        }

        try {
            processorMobile = processorMobileDao.findByModel(mobileDto.getModelProcessor());
        } catch (NoResultException e) {
            processorMobile = new ProcessorMobile(
                    mobileDto.getModelProcessor(),
                    mobileDto.getPlatform(),
                    mobileDto.getProcessorClockSpeed(),
                    mobileDto.getNumberOfCores(),
                    mobileDto.getProcessorBitDepth());
        }

        try {
            screen = screenDao.findByModel(mobileDto.getModelScreen());
        } catch (NoResultException e) {
            screen = new Screen(
                    mobileDto.getModelScreen(),
                    mobileDto.getNumberOfScreenColors(),
                    mobileDto.getScreenResolution(),
                    mobileDto.getAspectRatio(),
                    mobileDto.getScratchProtection());
        }

        return new Mobile(mobileDto.getBrand(),
                mobileDto.getModel(),
                mobileDto.getPrice(),
                mobileDto.getImg(),
                mobileDto.getQuantity(),
                mobileDto.getLength(),
                mobileDto.getWidth(),
                mobileDto.getThickness(),
                mobileDto.getWeight(), mobileDto.getColor(),
                mobileDto.getOs(),
                camera,
                processorMobile,
                screen);
    }
}
