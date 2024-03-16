package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.ModelService;
import kodlama.io.rentACar.business.responses.GetAllModelResponse;
import kodlama.io.rentACar.business.requests.CreateModelRequest;
import kodlama.io.rentACar.core.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllModelResponse> getAll() {
        List<Model> models = modelRepository.findAll();
        List<GetAllModelResponse> modelResponse = models.stream()
                .map(model-> this.modelMapperService.forResponse()
                        .map(model, GetAllModelResponse.class)).collect(Collectors.toList());
        return modelResponse;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model  = this.modelMapperService.forRuquest()
                .map(createModelRequest,Model.class );
        this.modelRepository.save(model);

    }
}
