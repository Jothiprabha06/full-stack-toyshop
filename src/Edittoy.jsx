import { useState } from "react";
import "./user.css";
import { useLocation, useNavigate } from "react-router-dom";
import axios from "axios";

const Toyedit = () => {

  const [bkn, setBkn] = useState("");
  const [atn, setAtn] = useState("");
  const nav = useNavigate();
  const [error, setError] = useState("");


  const handleEdit = async (e) => {
    console.log(bkn);
    console.log(atn);
    e.preventDefault();
      try {
        const response = await axios.put(`http://localhost:8080/edittoy?cost=${bkn}&toyname=${atn}`,{toyname: atn,
        cost: bkn}
         );
        console.log(atn + bkn);
        console.log(atn);
        console.log(bkn);
        console.log(response.data);
        if (response.data === "toy edited") {
          alert("toy edited");
          nav("/home");
        }
      } catch (error) {
        console.log(error);
      }
   
  };


  return (
    <div className="bodylgn1">
      <div className="bodylgn">
        <div className="containerlgn">
          <center className="lgn-font">Edit Book</center>
          <form onSubmit={handleEdit}>
            <div className="inputlgn">
              <span>
                <label htmlFor="password">Toy name</label>
              </span>
              <br />
              <input type="text" id="password" onChange={(e) => setAtn(e.target.value)}  />
              <br />
            </div>
            <div className="inputlgn">
              <span>
                <label htmlFor="password">cost</label>
              </span>
              <br />
              <input type="text" id="word" onChange={(e) => setBkn(e.target.value)} />
              <br />
            </div>
           
            <br />
            <div className="btnlgn">
              <center>
                <button>Update</button>
              </center>
              {error && <center>{error}</center>}
            </div>
          </form>
        </div>
      </div>
    </div>
  );
};

export default Toyedit;