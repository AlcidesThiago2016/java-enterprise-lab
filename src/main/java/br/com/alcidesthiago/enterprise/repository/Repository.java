package br.com.alcidesthiago.enterprise.repository;

import br.com.alcidesthiago.enterprise.equipamento.Equipamento;
import br.com.alcidesthiago.enterprise.equipamento.StatusEquipamento;

import java.util.*;

public class Repository <T extends Equipamento>{
    
    private final Map<Long , T> registros = new HashMap<>();
    
    public void save(T equipamento) {
        registros.put(equipamento.getId(), equipamento);
    }
    
    public Optional<T> findById(Long id) {
        return  Optional.ofNullable(registros.get(id));
    }
    
    public List<T> listAll() {
        return registros.values()
            .stream()
            .toList();
    }
    
   public List<T> findByHours(double hoursMin) {
        return registros.values()
            .stream()
            .filter(e -> e.getHorimetro() > hoursMin)
            .toList();
   } 
   
   public List<T> findByStatus(StatusEquipamento status){
        return registros.values()
            .stream()
            .filter(e -> e.getStatus() == status)
            .toList();
   }
   
   public List<T> listByHour() {
        return registros.values()
            .stream()
            .sorted(Comparator.comparingDouble(
                Equipamento::getHorimetro
            ).reversed()).toList();
   }
   
   public List<T> listByName(){
        return registros.values()
            .stream()
            .sorted(Comparator.comparing(Equipamento::getNome))
            .toList();
   }
   
   public long contByStatus(StatusEquipamento status){
        return registros.values()
            .stream()
            .filter(e -> e.getStatus() == status)
            .count();
   }
   
   public boolean remove(Long id){
        return registros.remove(id) != null;
   }
    
}
