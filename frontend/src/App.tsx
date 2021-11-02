import { BarChart } from "components/bar-chart";
import { DataTable } from "components/data-table";
import { DunutChart } from "components/dunut-chart";
import { Footer } from "components/footer";
import { NavBar } from "components/nav-bar";


function App() {
  return (
    <>
      <NavBar />
      <div className="container">

        <h1 className="text-primary py-3">Dashboard de Vendas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-segundary">Taxa de sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-segundary">Todas as vendas</h5>
            <DunutChart />
          </div>
        </div>
        <div className="py-3">
          <h2 className="text-primary">Todas as vendas </h2>
        </div>
        <DataTable />

      </div>
      <Footer />
    </>
  );
}

export default App;
