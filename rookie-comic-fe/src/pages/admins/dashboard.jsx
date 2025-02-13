// src/pages/Dashboard.jsx
import React from "react";
import { Line } from "react-chartjs-2";
import {
  Chart as ChartJS,
  CategoryScale,
  LinearScale,
  PointElement,
  LineElement,
  Title as ChartTitle,
  Tooltip,
  Legend,
} from "chart.js";

// Custom plugin to set the canvas background color from a CSS variable
const backgroundColorPlugin = {
  id: "custom_canvas_background_color",
  beforeDraw: (chart) => {
    const ctx = chart.canvas.getContext("2d");
    ctx.save();
    ctx.globalCompositeOperation = "destination-over";
    // Get the CSS variable for the chart background color
    const chartBgColor =
      getComputedStyle(document.documentElement)
        .getPropertyValue("--chart-bg-color")
        .trim() || "#343a40";
    ctx.fillStyle = chartBgColor;
    ctx.fillRect(0, 0, chart.width, chart.height);
    ctx.restore();
  },
};

// Register Chart.js components along with the custom plugin
ChartJS.register(
  CategoryScale,
  LinearScale,
  PointElement,
  LineElement,
  ChartTitle,
  Tooltip,
  Legend,
  backgroundColorPlugin
);

const Dashboard = () => {
  // Sample data for the chart
  const chartData = {
    labels: ["January", "February", "March", "April", "May", "June", "July"],
    datasets: [
      {
        label: "Monthly Revenue",
        data: [3000, 2000, 4000, 5000, 6000, 5500, 7000],
        fill: false,
        borderColor: "rgb(75, 192, 192)",
        tension: 0.1,
      },
    ],
  };

  // Chart options with dark-themed styling
  const chartOptions = {
    responsive: true,
    plugins: {
      legend: {
        position: "top",
        labels: {
          color: "#fff", // White legend text
        },
      },
      title: {
        display: true,
        text: "Monthly Revenue",
        color: "#fff", // White title text
      },
    },
    scales: {
      x: {
        ticks: {
          color: "#fff", // White x-axis labels
        },
        grid: {
          color: "rgba(255,255,255,0.2)", // Slightly transparent white grid lines
        },
      },
      y: {
        ticks: {
          color: "#fff", // White y-axis labels
        },
        grid: {
          color: "rgba(255,255,255,0.2)",
        },
      },
    },
  };

  return (
    <div style={{ padding: "20px" }}>
      {/* Beautiful Title */}
      <div style={{ textAlign: "center", margin: "20px 0" }}>
        <h1
          style={{
            fontFamily: "'sans-serif', sans-serif", // Ensure this font is loaded via CSS or a <link> tag
            fontSize: "3rem",
            color: "#ffffff",
          }}
        >
          Admin Dashboard
        </h1>
        <p style={{ fontSize: "1.2rem", color: "#ccc" }}>
          Welcome, Admin! Manage your website here.
        </p>
      </div>

      {/* Dashboard Cards */}
      <div className="row mb-4">
        {/* Users Card */}
        <div className="col-md-4">
          <div className="card text-white bg-primary mb-3">
            <div className="card-header">Users</div>
            <div className="card-body">
              <h5 className="card-title">1,024</h5>
              <p className="card-text">Total Users</p>
            </div>
          </div>
        </div>

        {/* Orders Card */}
        <div className="col-md-4">
          <div className="card text-white bg-success mb-3">
            <div className="card-header">Orders</div>
            <div className="card-body">
              <h5 className="card-title">256</h5>
              <p className="card-text">Orders This Month</p>
            </div>
          </div>
        </div>

        {/* Revenue Card */}
        <div className="col-md-4">
          <div className="card text-white bg-warning mb-3">
            <div className="card-header">Revenue</div>
            <div className="card-body">
              <h5 className="card-title">$12,345</h5>
              <p className="card-text">Revenue Today</p>
            </div>
          </div>
        </div>
      </div>

      {/* Chart Section */}
      <div className="card mb-4">
        <div className="card-body">
        <div style={{
  border: "2px solid var(--primary-color)",
  borderRadius: "5px",
  padding: "10px",
  backgroundColor: "var(--chart-bg-color)"
}}>
  <Line data={chartData} options={chartOptions} />
</div>
        </div>
      </div>
    </div>
  );
};

export default Dashboard;
