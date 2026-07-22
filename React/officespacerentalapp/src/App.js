import office from "./office.jpg";

function App() {

  const officeSpaces = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Hyderabad"
    },
    {
      Name: "WeWork",
      Rent: 55000,
      Address: "Bangalore"
    }
  ];

  return (
    <div style={{ marginLeft: "150px" }}>

      <h1>Office Space , at Affordable Range</h1>

      {
        officeSpaces.map((item, index) => {

          let colors = [];

          if (item.Rent <= 60000) {
            colors.push("Red");
          }
          else {
            colors.push("Green");
          }

          return (

            <div key={index} style={{ marginBottom: "40px" }}>

              <img
                src={office}
                width="25%"
                height="25%"
                alt="Office Space"
              />

              <h1>Name: {item.Name}</h1>

              <h3 style={{ color: colors[0] }}>
                Rent: Rs. {item.Rent}
              </h3>

              <h3>Address: {item.Address}</h3>

            </div>

          );

        })
      }

    </div>
  );
}

export default App;