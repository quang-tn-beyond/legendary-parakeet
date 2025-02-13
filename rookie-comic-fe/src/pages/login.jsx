import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import axios from "axios";

export default function Login() {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [error, setError] = useState(""); // Thêm state để xử lý lỗi
    const navigate = useNavigate(); // Dùng để điều hướng sau khi đăng nhập

    const handleSubmit = async (e) => {
        e.preventDefault();
        setError(""); // Reset lỗi trước khi gửi request

        try {
            const response = await axios.post("http://localhost:8080/api/auth/login", {
                email,
                password,
            });

            // Giả sử API trả về token
            const { token } = response.data;

            // Lưu token vào localStorage hoặc cookies
            localStorage.setItem("token", token);

            // Chuyển hướng đến trang admin hoặc dashboard
            navigate("/admin");
        } catch (error) {
            setError("Đăng nhập thất bại! Vui lòng kiểm tra lại email và mật khẩu.");
            console.error("Login error:", error);
        }
    };

    return (
        <>
            {/* Normal Breadcrumb Begin */}
            <section className="normal-breadcrumb set-bg" style={{ backgroundImage: "url('/assets/img/normal-breadcrumb.jpg')" }}>
                <div className="container">
                    <div className="row">
                        <div className="col-lg-12 text-center">
                            <div className="normal__breadcrumb__text">
                                <h2>Login</h2>
                                <p>Welcome to the official Manga blog.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            {/* Normal Breadcrumb End */}

            {/* Login Section Begin */}
            <section className="login spad">
                <div className="container">
                    <div className="row">
                        <div className="col-lg-6">
                            <div className="login__form">
                                <h3>Login</h3>
                                {error && <p style={{ color: "red" }}>{error}</p>} {/* Hiển thị lỗi nếu có */}
                                <form onSubmit={handleSubmit}>
                                    <div className="input__item">
                                        <input
                                            type="text"
                                            placeholder="Email address"
                                            value={email}
                                            onChange={(e) => setEmail(e.target.value)}
                                        />
                                        <span className="icon_mail"></span>
                                    </div>
                                    <div className="input__item">
                                        <input
                                            type="password"
                                            placeholder="Password"
                                            value={password}
                                            onChange={(e) => setPassword(e.target.value)}
                                        />
                                        <span className="icon_lock"></span>
                                    </div>
                                    <button type="submit" className="site-btn">Login Now</button>
                                </form>
                                <Link to="/forgot-password" className="forget_pass">
                                    Forgot Your Password?
                                </Link>
                            </div>
                        </div>
                        <div className="col-lg-6">
                            <div className="login__register">
                                <h3>Don’t Have An Account?</h3>
                                <Link to="/register" className="primary-btn">Register Now</Link>
                            </div>
                        </div>
                    </div>
                    <div className="login__social">
                        <div className="row d-flex justify-content-center">
                            <div className="col-lg-6">
                                <div className="login__social__links">
                                    <span>or</span>
                                    <ul>
                                        <li><a href="#" className="facebook"><i className="fa fa-facebook"></i> Sign in With Facebook</a></li>
                                        <li><a href="http://localhost:8080/api/auth/google" className="google">
                                            <i className="fa fa-google"></i> Sign in With Google
                                        </a></li>
                                        <li><a href="#" className="twitter"><i className="fa fa-twitter"></i> Sign in With Twitter</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            {/* Login Section End */}
        </>
    );
}
