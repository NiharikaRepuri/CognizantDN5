import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        name="Steeve"
        school="DNV Public School"
        total={284}
        maxMarks={300}
      />
    </div>
  );
}

export default App;