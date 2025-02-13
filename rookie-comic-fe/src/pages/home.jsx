const BackgroundComponent = ({ imageUrl }) => {
    return (
      <div
        style={{
          backgroundImage: `url(${imageUrl})`,
          backgroundSize: "cover",
          backgroundPosition: "center",
          width: "100%",
          height: "300px",
        }}
      />
    );
  };

export default function Home() {
    return (
        <section class="product spad">
            <div className="container">
                <div className="row">
                    <div className="col-lg-8">
                        <div className="trending__product">
                            <div className="row">
                                <div className="col-lg-8 col-md-8 col-sm-8">
                                    <div className="section-title">
                                        <h4>Trending Now</h4>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-4 col-sm-4">
                                    <div className="btn__all">
                                        <a href="#" class="primary-btn">View All <span class="arrow_right"></span></a>
                                    </div>
                                </div>
                            </div>
                            <div className="row">
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                        <div className="ep">18 / 18</div>
                                        <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                        <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                    </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">The Seven Deadly Sins: Wrath of the Gods</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Gintama Movie 2: Kanketsu-hen - Yorozuya yo Eien</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Shingeki no Kyojin Season 3 Part 2</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Fullmetal Alchemist: Brotherhood</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Shiratorizawa Gakuen Koukou</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Code Geass: Hangyaku no Lelouch R2</a></h5>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="popular__product">
                            <div className="row">
                                <div className="col-lg-8 col-md-8 col-sm-8">
                                    <div className="section-title">
                                        <h4>Popular Shows</h4>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-4 col-sm-4">
                                    <div className="btn__all">
                                        <a href="#" class="primary-btn">View All <span class="arrow_right"></span></a>
                                    </div>
                                </div>
                            </div>
                            <div className="row">
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Sen to Chihiro no Kamikakushi</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Kizumonogatari III: Reiket su-hen</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Shirogane Tamashii hen Kouhan sen</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Rurouni Kenshin: Meiji Kenkaku Romantan</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Mushishi Zoku Shou 2nd Season</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Monogatari Series: Second Season</a></h5>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="recent__product">
                            <div className="row">
                                <div className="col-lg-8 col-md-8 col-sm-8">
                                    <div className="section-title">
                                        <h4>Recently Added Shows</h4>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-4 col-sm-4">
                                    <div className="btn__all">
                                        <a href="#" class="primary-btn">View All <span class="arrow_right"></span></a>
                                    </div>
                                </div>
                            </div>
                            <div className="row">
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Great Teacher Onizuka</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Fate/stay night Movie: Heaven's Feel - II. Lost</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Mushishi Zoku Shou: Suzu no Shizuku</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Fate/Zero 2nd Season</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Kizumonogatari II: Nekket su-hen</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">The Seven Deadly Sins: Wrath of the Gods</a></h5>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="live__product">
                            <div className="row">
                                <div className="col-lg-8 col-md-8 col-sm-8">
                                    <div className="section-title">
                                        <h4>Live Action</h4>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-4 col-sm-4">
                                    <div className="btn__all">
                                        <a href="#" class="primary-btn">View All <span class="arrow_right"></span></a>
                                    </div>
                                </div>
                            </div>
                            <div className="row">
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Shouwa Genroku Rakugo Shinjuu</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Mushishi Zoku Shou 2nd Season</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Mushishi Zoku Shou: Suzu no Shizuku</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">The Seven Deadly Sins: Wrath of the Gods</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Fate/stay night Movie: Heaven's Feel - II. Lost</a></h5>
                                        </div>
                                    </div>
                                </div>
                                <div className="col-lg-4 col-md-6 col-sm-6">
                                    <div className="product__item">
                                        <div className="product__item__pic set-bg">
                                        <BackgroundComponent imageUrl="/assets/img/trending/image.png" />
                                            <div className="ep">18 / 18</div>
                                            <div className="comment"><i class="fa fa-comments"></i> 11</div>
                                            <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        </div>
                                        <div className="product__item__text">
                                            <ul>
                                                <li>Active</li>
                                                <li>Movie</li>
                                            </ul>
                                            <h5><a href="#">Kizumonogatari II: Nekketsu-hen</a></h5>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div className="col-lg-4 col-md-6 col-sm-8">
                        <div className="product__sidebar">
                            <div className="product__sidebar__view">
                                <div className="section-title">
                                    <h5>Top Views</h5>
                                </div>
                                <ul class="filter__controls">
                                    <li class="active" data-filter="*">Day</li>
                                    <li data-filter=".week">Week</li>
                                    <li data-filter=".month">Month</li>
                                    <li data-filter=".years">Years</li>
                                </ul>
                                <div className="filter__gallery">
                                    <div className="product__sidebar__view__item set-bg mix day years"
                                        style={{ backgroundImage: "url('/assets/img/blog/details/bd-item.png')" }}>
                                        <div className="ep">18 / ?</div>
                                        <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        <h5><a href="#">Boruto: Naruto next generations</a></h5>
                                    </div>
                                    <div className="product__sidebar__view__item set-bg mix month week"
                                        style={{ backgroundImage: "url('/assets/img/blog/details/bd-item-1.jpg')" }}>
                                        <div className="ep">18 / ?</div>
                                        <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        <h5><a href="#">The Seven Deadly Sins: Wrath of the Gods</a></h5>
                                    </div>
                                    <div className="product__sidebar__view__item set-bg mix week years"
                                        style={{ backgroundImage: "url('/assets/img/blog/details/bd-item-2.jpg')" }}>
                                        <div className="ep">18 / ?</div>
                                        <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        <h5><a href="#">Sword art online alicization war of underworld</a></h5>
                                    </div>
                                    <div className="product__sidebar__view__item set-bg mix years month"
                                        style={{ backgroundImage: "url('/assets/img/blog/details/bd-item-3.jpg')" }}>
                                        <div className="ep">18 / ?</div>
                                        <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        <h5><a href="#">Fate/stay night: Heaven's Feel I. presage flower</a></h5>
                                    </div>
                                    <div className="product__sidebar__view__item set-bg mix day"
                                        style={{ backgroundImage: "url('/assets/img/blog/details/bd-item.png')" }}>
                                        <div className="ep">18 / ?</div>
                                        <div className="view"><i class="fa fa-eye"></i> 9141</div>
                                        <h5><a href="#">Fate stay night unlimited blade works</a></h5>
                                    </div>
                                </div>
                            </div>
                            <div className="product__sidebar__comment">
                                <div className="section-title">
                                    <h5>New Comment</h5>
                                </div>
                                <div className="product__sidebar__comment__item">
                                    <div className="product__sidebar__comment__item__pic">
                                        <img src="/assets/img/sidebar/comment-1.jpg" alt="" />
                                    </div>
                                    <div className="product__sidebar__comment__item__text">
                                        <ul>
                                            <li>Active</li>
                                            <li>Movie</li>
                                        </ul>
                                        <h5><a href="#">The Seven Deadly Sins: Wrath of the Gods</a></h5>
                                        <span><i class="fa fa-eye"></i> 19.141 Viewes</span>
                                    </div>
                                </div>
                                <div className="product__sidebar__comment__item">
                                    <div className="product__sidebar__comment__item__pic">
                                        <img src="/assets/img/sidebar/comment-2.jpg" alt="" />
                                    </div>
                                    <div className="product__sidebar__comment__item__text">
                                        <ul>
                                            <li>Active</li>
                                            <li>Movie</li>
                                        </ul>
                                        <h5><a href="#">Shirogane Tamashii hen Kouhan sen</a></h5>
                                        <span><i class="fa fa-eye"></i> 19.141 Viewes</span>
                                    </div>
                                </div>
                                <div className="product__sidebar__comment__item">
                                    <div className="product__sidebar__comment__item__pic">
                                        <img src="/assets/img/sidebar/comment-3.jpg" alt="" />
                                    </div>
                                    <div className="product__sidebar__comment__item__text">
                                        <ul>
                                            <li>Active</li>
                                            <li>Movie</li>
                                        </ul>
                                        <h5><a href="#">Kizumonogatari III: Reiket su-hen</a></h5>
                                        <span><i class="fa fa-eye"></i> 19.141 Viewes</span>
                                    </div>
                                </div>
                                <div className="product__sidebar__comment__item">
                                    <div className="product__sidebar__comment__item__pic">
                                        <img src="/assets/img/sidebar/comment-4.jpg" alt="" />
                                    </div>
                                    <div className="product__sidebar__comment__item__text">
                                        <ul>
                                            <li>Active</li>
                                            <li>Movie</li>
                                        </ul>
                                        <h5><a href="#">Monogatari Series: Second Season</a></h5>
                                        <span><i class="fa fa-eye"></i> 19.141 Viewes</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    );
}