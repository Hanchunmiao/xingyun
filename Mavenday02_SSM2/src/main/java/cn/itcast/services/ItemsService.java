package cn.itcast.services;

import cn.itcast.domain.Items;
import org.springframework.stereotype.Service;

@Service
public interface ItemsService {

    Items findById(Integer id);
}
