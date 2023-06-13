import { useState } from "react";
import "./user.css";
import {useNavigate } from "react-router-dom";
import axios from "axios";

const Atoy = () => {

  const [tcost,setTcost] = useState("");
  const [tname,setTname] = useState("");
  const navigate = useNavigate();


  const handletoy = async (e) =>{
    e.preventDefault();
      const data={
        cost:tcost,
        toyname:tname,
      };
      try{
        const response = await axios.post("http://localhost:8080/save-toy",data);
        console.log(response.data);
        alert("toy added successfully");
        navigate("/home");
      }
      catch(error){
        console.groupCollapsed(error);
      }
  }

  return (
    <div class="bodylgn1">
      <div class="bodylgn">
        <div class="containerlgn">
          <center class="lgn-font">Add toy</center>
          <form onSubmit={handletoy}>
            <div class="inputlgn">
              <span>
                <label for="username">Toy name</label>
              </span>
              <br></br>
              <input type="text" id="username" onChange={(e)=>{setTname(e.target.value)}}></input>
            </div>
            <div class="inputlgn">
              <span>
                <label for="password">Cost</label>
              </span>
              <br></br>
              <input type="text" id="password" onChange={(e)=>{setTcost(e.target.value)}}></input>
              <br></br>
            </div>
            <div class="btnlgn">
              <center>
                  <button>Add</button>
              </center>
            </div>
          </form>
        </div>
      </div>
    </div>
  );
}

export default Atoy;