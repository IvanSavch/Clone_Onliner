package onliner.dao.mobile;

import onliner.entity.mobile.ProcessorMobile;

public interface ProcessorMobileDao {
    ProcessorMobile findByModel(String model);
}
