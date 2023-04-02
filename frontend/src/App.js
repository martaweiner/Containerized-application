import { Component } from 'react';

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
        movies: null,
        loading: false
    };
  }

  apiUrl = 'http://localhost:8080/films/';

  componentDidMount() {
    this.setState({ loading: true });
    fetch(this.apiUrl)
      .then(response => response.json())
      .then(data => {
        this.setState({ movies: data, loading: false });
      });
  }

  render() {
    const renderMovies = this.state.movies?.map((movie, index) => (
      <tr>
        <th>{index + 1}</th>
        <td>{movie.filmName}</td>
        <td>{movie.description}</td>
        <td>{movie.yearOfProduction}</td>
        <td>{movie.rating}</td>
      </tr>
    ));

    return (
      <div className="container">
        <h1 className="header">Marta's Movies App</h1>
        <table className={`table table-dark table-striped table-bordered ${this.state.loading ? "" : "loaded"}`}>
          <thead>
            <tr>
              <th scope="col">No.</th>
              <th scope="col">Name</th>
              <th scope="col">Description</th>
              <th scope="col">Year</th>
              <th scope="col">Rating</th>
            </tr>
          </thead>
          <tbody>{renderMovies}</tbody>
        </table>
        <div className={`loading-container mt-5 ${this.state.loading ? "" : "hidden"}`}>
          <div className="d-flex justify-content-center">
            <div className="spinner-border" role="status">
              <span className="visually-hidden">Loading...</span>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default App;
