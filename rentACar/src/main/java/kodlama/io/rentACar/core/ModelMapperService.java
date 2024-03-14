package kodlama.io.rentACar.core;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;


public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRuquest();

}
