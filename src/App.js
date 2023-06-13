import './App.css';
import { Route,Routes } from 'react-router-dom';
import Login from './Login';
import Reg from './Reg';
import Home from './home';
import Home1 from './home1';
import Resetpassword from './forgot';
import Remove from './remove';
import Toy1 from './toy1';
import Toy2 from './toy2';
import Toy3 from './toy3';
import Toy4 from './toy4';
import Toy5 from './toy5';
import Toy6 from './toy6';
import Toy7 from './toy7';
import Toy8 from './toy8';
import Toy9 from './toy9';
import Toy10 from './toy10';
import Atoy from './Atoy';
import Edittoy from './Edittoy';


function App() {
  return (
    
      <Routes>
      <Route path='/login' element={<Login/>}></Route>
      <Route path='/Reg' element={<Reg/>}></Route>
      <Route path='/home' element={<Home/>}></Route>
      <Route path='/home1' element={<Home1/>}></Route>
      <Route path='/forgot' element={<Resetpassword/>}></Route>
      <Route path='/remove' element={<Remove/>}></Route>
      <Route path='/toy1' element={<Toy1/>}></Route>
      <Route path='/toy2' element={<Toy2/>}></Route>
      <Route path='/toy3' element={<Toy3/>}></Route>
      <Route path='/toy4' element={<Toy4/>}></Route>
      <Route path='/toy5' element={<Toy5/>}></Route>
      <Route path='/toy6' element={<Toy6/>}></Route>
      <Route path='/toy7' element={<Toy7/>}></Route>
      <Route path='/toy8' element={<Toy8/>}></Route>
      <Route path='/toy9' element={<Toy9/>}></Route>
      <Route path='/toy10' element={<Toy10/>}></Route>
      <Route path='/atoy' element={<Atoy/>}></Route>
      <Route path='/edittoy' element={<Edittoy/>}></Route>
      
    </Routes>
  );
}

export default App;