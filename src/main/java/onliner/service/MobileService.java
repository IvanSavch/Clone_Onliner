package onliner.service;

import onliner.dao.mobile.MobileDao;
import onliner.entity.mobile.Mobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class MobileService {
    @Autowired
    private MobileDao mobileDao;
    public void save(Mobile mobile){
        mobileDao.save(mobile);
    }
}
