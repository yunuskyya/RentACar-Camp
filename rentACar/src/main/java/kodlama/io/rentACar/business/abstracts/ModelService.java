package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.responses.GetAllModelResponse;
import kodlama.io.rentACar.business.ruquests.CreateModelRequest;

import java.util.List;

public interface ModelService {
    List<GetAllModelResponse> getAll();
    void add(CreateModelRequest createModelRequest);
}
