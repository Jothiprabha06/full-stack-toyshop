import { useEffect, useState } from "react";
import "./home.css";
import axios from "axios";
import { Link } from "react-router-dom";

const Home = () => {

  const [toydetails, setToydetails] = useState([]);

  useEffect(() => {
    loadToyDetails();
  }, []);
  const loadToyDetails = async () => {
    const result = await axios.get("http://localhost:8080/gettoy");
    setToydetails(result.data);
    console.log(result.data);
  }

  const deleteToy = async (e) => {
    const sno = e.target.value;
    await axios.delete("http://localhost:8080/dlttoy/" + sno);
    loadToyDetails();
  }

  return (
    <div className="adm-bdy">
      <div className="adm-nav">
      <Link className="n-link" to="/atoy">
      <button>Add Toy</button>
    </Link>
    <Link className="n-link" to="/edittoy">
      <button>Edit Toy</button>
    </Link>
    <Link className="n-link" to="/home">
      <button>Home</button>
    </Link>
      </div>
      <div className="adm-table1">
        <div className="adm-table">
          <table>
            <tbody>
              <tr>
                <td className="m-head" colSpan="7">Toy Details</td>
              </tr>
              <tr>
                <th>Sno</th>
                <th>Cost</th>
                <th>Toy Name</th>
                <th>Delete</th>
              </tr>
              {
                toydetails && toydetails.map((toy, index) => (
                  <tr key={index}>
                     <td>{index + 1}</td> 
                    <td>{toy.cost}</td>
                    <td>{toy.toyname}</td> 
                    <td><button value={toy.sno} onClick={(e) => deleteToy(e)} className="adm-delbtn" title="Delete">Delete</button></td>
                  </tr>
                ))
              }
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
}

export default Home;