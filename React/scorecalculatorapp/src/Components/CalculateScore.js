import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {

  const score = ((props.total / props.maxMarks) * 100).toFixed(2);

  return (
    <div className="container">
      <h1>Student Details:</h1>

      <h3>
        Name: <span className="name">{props.name}</span>
      </h3>

      <h3>
        School: <span className="school">{props.school}</span>
      </h3>

      <h3>
        Total: <span className="total">{props.total} Marks</span>
      </h3>

      <h3>
        Score: <span className="score">{score}%</span>
      </h3>
    </div>
  );
}

export default CalculateScore;