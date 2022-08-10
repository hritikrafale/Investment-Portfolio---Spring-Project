package com.example.investmentportfolio.investment;

import com.example.investmentportfolio.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvestmentController {
    @Autowired
    private InvestmentRepository investmentRepository;

    @GetMapping("investment")
    public Investment getInvestment(@RequestParam Long id){
        return investmentRepository.findById(id).get();
    }

    @GetMapping("investments")
    public List<Investment> getInvestments(){
        return investmentRepository.findAll();
    }

    @PostMapping("new_investment")
    public void addInvestment(@RequestBody Investment investment){
        investmentRepository.save(investment);
    }

    @PutMapping("update_investment")
    public Investment updateUser(@RequestParam Long id, @RequestBody Investment investment){
        Investment currInvestment = investmentRepository.findById(id).get();
        currInvestment.setAmount(10000000);
        investmentRepository.save(currInvestment);
        return currInvestment;
    }

    @DeleteMapping("deleteinvestment")
    public void deleteInvestment(@RequestParam Long id){
        investmentRepository.deleteById(id);
    }
}
