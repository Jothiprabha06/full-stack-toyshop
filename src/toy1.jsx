import { Link } from 'react-router-dom';
import './toy1.css';
import k1 from './assests/h1.jpg';
const Toy1= () => {
    return (
        
             <div>
             <img src={k1} alt="" className="apple"></img>
             <h1 className="apple1">TOY DESCRIPTION</h1>
             <h5 className="apple10">RATING:5★</h5>
             <p className="apple2">Soft Fabric Minions cartoon character toys made of cotton .This toy will make yours kids happy.</p>
            <h1 className="apple3">KEY FEATURES</h1>
            <p className="apple2">CHARACTER:Minions</p>
            <p className="apple2">AGE:1+Years</p> 
            <p className="apple2">FILLING MATERIAL:Soft Cotton</p>
            <p className="apple2">WASHABLE:Yes</p> 
            <p className="apple2">SOUND SUPPORT:No</p>
            <p className="apple2">WEIGHT:240g</p>
            <p className="apple2">COUNTRY OF ORIGIN:India</p> 
           
             </div>
             )
             }
 export default Toy1;