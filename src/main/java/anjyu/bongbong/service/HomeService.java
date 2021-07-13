package anjyu.bongbong.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anjyu.bongbong.mapper.HomeMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HomeService {
	
	@Autowired
	HomeMapper homeMapper;
	
	public List<Map<String, Object>> selectAllList() throws Exception{
		log.debug("홈 서비스 시작");
        
        List<Map<String, Object>> result = homeMapper.selectAllList();
        
        log.debug("홈 서비스 종료");
		return result;
	}

}
