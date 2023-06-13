import { Link } from 'react-router-dom';
import './home1.css';
import i1 from './assests/h1.jpg';
import i2 from './assests/u1.jpeg';
import i3 from './assests/bb1.jpg';
import i4 from './assests/pp1.jpeg';
import i5 from './assests/tb1.jpeg';
import i6 from './assests/e1.jpeg';
import i7 from './assests/psp3.jpg';
import i8 from './assests/r1.jpg';
import i9 from './assests/x1.jpg';
import i10 from './assests/a1.jpg';
const Home1 = () => {
    return (
        <div className='home-cont1'>
            <div className='navbar157'>
            <Link to="/login">
                  <button className="font157">LOGIN👤</button>
                </Link>
                <div className='navbar158'>
            <Link to="/remove">
                  <button className="font158">LOGOUT👤</button>
                </Link>
                <Link to="/home">
                <button className="font158">HOME</button>
              </Link>
            </div>
            </div>
            <div className='box123'>
                <h2>SOFT TOYS</h2>
                <div class="grid-container1">
                    <div class="grid-item"><Link to="/toy1"><img src={i1} alt=""></img></Link></div>
                    <div class="grid-item"><Link to="/toy2"><img src={i2} alt=""></img></Link></div>
                    <div class="grid-item"><Link to="/toy3"><img src={i3} alt=""></img></Link></div>
                    <div class="grid-item"><Link to="/toy4"><img src={i4} alt=""></img></Link></div>
                    <div class="grid-item"><Link to="/toy5"><img src={i5} alt=""></img></Link></div>
                </div>
                <h2>ELECTRONIC TOYS</h2>
                <div class="grid-container2">
                    <div class="grid-item"><Link to="/toy6"><img src={i6} alt=""></img></Link></div>
                    <div class="grid-item"><Link to="/toy7"><img src={i7} alt=""></img></Link></div>
                    <div class="grid-item"><Link to="/toy8"><img src={i8} alt=""></img></Link></div>
                    <div class="grid-item"><Link to="/toy9"><img src={i9} alt=""></img></Link></div>
                    <div class="grid-item"><Link to="/toy10"><img src={i10} alt=""></img></Link></div>
                </div>
            </div>
        </div>
    )

}
export default Home1;