import React from 'react';
import { Link } from "react-router-dom";
import './styles.css';



const List = (props)=>{
    return(
        <div>
            {props.data.map((item,index) => (
            <li key={index}>
            <div className="listElement">
                    <h1><Link to={`/list/${index}`}>{item.name}</Link></h1>
                    <p>{item.description}</p>
                    </div>
            </li>
          ))}
        </div>
    )
}
export default List;
