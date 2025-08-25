package onliner.dao.mobile;

import onliner.entity.mobile.Mobile;

import java.util.List;

public interface MobileDao {
    void save(Mobile mobile);
    List<Mobile> getAllMobile();
}
