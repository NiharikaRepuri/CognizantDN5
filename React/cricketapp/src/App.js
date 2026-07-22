import React from "react";
import ListofPlayers from "./ListofPlayers";
import Scorebelow70 from "./Scorebelow70";
import { OddPlayers, EvenPlayers, IndianPlayers } from "./IndianPlayers";
import ListofIndianPlayers from "./ListofIndianPlayers";

function App() {

    const players = [
        { name: "Sachin", score: 95 },
        { name: "Dhoni", score: 88 },
        { name: "Virat", score: 92 },
        { name: "Rohit", score: 65 },
        { name: "Rahul", score: 70 },
        { name: "Hardik", score: 55 },
        { name: "Jadeja", score: 78 },
        { name: "Ashwin", score: 60 },
        { name: "Bumrah", score: 45 },
        { name: "Shami", score: 68 },
        { name: "Gill", score: 82 }
    ];

    const IndianTeam = [
        "Sachin",
        "Dhoni",
        "Virat",
        "Rohit",
        "Rahul",
        "Hardik"
    ];

    var flag = true;

    if (flag === true) {
        return (
            <div>

                <h1>List of Players</h1>
                <ListofPlayers players={players} />

                <hr />

                <h1>List of Players having Scores Less than 70</h1>
                <Scorebelow70 players={players} />

            </div>
        );
    }
    else {
        return (
            <div>

                <h1>Indian Team</h1>

                <h2>Odd Players</h2>
                {OddPlayers(IndianTeam)}

                <hr />

                <h2>Even Players</h2>
                {EvenPlayers(IndianTeam)}

                <hr />

                <h2>List of Indian Players Merged</h2>
                <ListofIndianPlayers IndianPlayers={IndianPlayers} />

            </div>
        );
    }
}

export default App;