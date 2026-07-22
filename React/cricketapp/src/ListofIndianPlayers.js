import React from "react";

function ListofIndianPlayers(props) {

    return (
        <div>
            {
                props.IndianPlayers.map((item, index) => (
                    <li key={index}>{item}</li>
                ))
            }
        </div>
    );
}

export default ListofIndianPlayers;