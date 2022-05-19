package cl.tbd.ejemplo1.services;
import cl.tbd.ejemplo1.models.Region;
import cl.tbd.ejemplo1.repositories.RegionRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class RegionService {
    private final RegionRepository regionRepository;

    RegionService(RegionRepository regionRepository){
        this.regionRepository = regionRepository;
    }

    @GetMapping("/regions")
    public List<Region> getAllRegions(){
        System.out.println("Get All Regions");
        try{
            List<Region> regions = regionRepository.getAllRegions();
            System.out.println("Start");
            for (Region r : regions){
                System.out.println("Region: "+ r.getNom_reg());
            }
            System.out.println("End");
            return regions;
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
