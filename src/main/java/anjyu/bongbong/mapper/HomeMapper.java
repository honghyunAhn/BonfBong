package anjyu.bongbong.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {

	public List<Map<String, Object>> selectAllList() throws Exception;

}
