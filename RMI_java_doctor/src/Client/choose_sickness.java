/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author awet
 */
public class choose_sickness extends UnicastRemoteObject implements optionIF{

    public choose_sickness()throws RemoteException{}
   
    public String getOptions(String name) throws RemoteException {
//        boolean found =false;
        String r = null;
        if(name.equals("headace")){
               return r = ("Headache pain may need to be managed with medications. \n"
                        + "\n1: Generic Name:aspirin*\n"
                        + "\t\n2: Brand Name: Bayer® , Bufferin®, Ecotrin®\n"
                        + "\t\n3: Symptoms Relieved: Relief of fever and pain\n"
                       + "\t\n4 Precautions and possible side effects: Do not use in children "
                       + "under 14 years of age due to the potential for Reye’s syndrome. Side effects may "
                       + "include: heartburn, gastrointestinal (GI) bleeding, bronchospasm or constriction that"
                       + " causes narrowing of the airways, anaphylaxis and peptic ulcer\n"
                       
                       + "\n1: Generic Name: acetaminophen, paracetamol*\n"
                        + "\t\n2: Brand Name: Tylenol®\n"
                        + "\t\n3: Symptoms Relieved: Relief of fever and pain\n"
                       + "\t\n4 Precautions and possible side effects: Few side effects, if taken as directed, although they may include changes in blood counts and liver function "
                       );
        }
        if(name.equals("stomach flu")){
            return r =("\n1:Drink lots of fluids"
                    + "\n2:Fluids are critically important since you’re losing vital bodily fluids through \n"
                    + "sweating, vomiting, and diarrhea. If you’re having trouble keeping liquids down, \n"
                    + "try taking small sips at regular intervals or chewing ice chips. The best fluids to drink are:\n"
                    + "\t\n3: clear liquids, such as water and broth\n"
                    + "\t\n4: over-the-counter preparations like Pedialyte \n"
                    +"\t\n5: sports drinks, which can help with electrolyte replacement (this should be reserved for older children and adults)\n"
                    + "\nWhat Not to Drink\n"
                    +"\t caffeinated drinks like coffee, strong black tea, and chocolate, which can affect\n"
                    + " \tyour sleep at a time when getting enough rest is crucial"
                    +"\talcohol, which acts as a diuretic.");
            
        }
        if(name.equals("caught")){
            return r =("\n1:To treat cought:\n"
                    + "\n:The doctor may tell you not to treat a cough from a cold unless \n"
                    + "it keeps you up at night or gets in the way of your daily life. Coughing \n"
                    + "up mucus helps keep your lungs clear. This is especially true if you \n"
                    + "smoke or have asthma or emphysema."
                    + "\n: Dextromethorphan can affect drugs that treat depression. Also, some \n"
                    + "combination cold and cough medicines contain decongestants, which can raise\n"
                    + " your blood pressure. So skip them if your BP is high or if you have heart disease."
                   );
        }
        if(name.equals("fever")){
            return r =("\n1:Prescription medications\n"
                    + "\n:Depending on the cause of your fever, your doctor may prescribe an \n"
                    + "antibiotic, especially if he or she suspects a bacterial infection, such \n"
                    + "as pneumonia or strep throat.\n"
                    + "\n2: home remedies\n"
                    + "\tDrink plenty of fluids\n"
                    + "\tRest\n"
                    + "\tStay cool\n");
        }
        
        if(name.equals("lever")){
            return r = ("\nsjahda sagjdhg awdoqwu dsahgdjhsagdjdoi dajs\n"
                    + "utyewbajhgd jagdpoa daydoy qgsvjhgs hjh\n"
                    + "iqwiuyh sjhg jhadla dlksd\n");
        }
        if(name.equals("diabet")){
            return r = ("\ntytywew teytwi  amak dhksahdaoisud uhjasd kdhskajd\n"
                    + "utyewbajhgd jagdpoa daydoy qgsvjhgs hjh\n"
                    + "wuyiuysa sjhg jhadla dlksd\n"
                    + "mvbmvx vbawo dasdsa ,daskdj jd yd pquwdghas kjda\n");
        }
        if(name.equals("eye")){
            return r = ("\nyuyeu eytuyqte xnvxn Zd\n"
                    + "utyewbajhgd jagdpoa daydoy qgsvjhgs hjh\n"
                    + "nbzxmcnb zc haksjch\n");
        }
        return r;
        
    }
    
    
}
