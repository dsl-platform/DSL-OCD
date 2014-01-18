package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneSetOfOneDoubles_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneSetOfOneDoubles: Set[Double]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneSetOfOneDoubles_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneSetOfOneDoubles_2("+ URI +")"

   def copy(oneSetOfOneDoubles: Set[Double] = this._oneSetOfOneDoubles): OneSetOfOneDoubles_2 = {

  require(oneSetOfOneDoubles ne null, "Null value was provided for property \"oneSetOfOneDoubles\"")
    new OneSetOfOneDoubles_2(_URI = this.URI, __locator = this.__locator, _oneSetOfOneDoubles = oneSetOfOneDoubles)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneDoubles_2): this.type = {
    this._URI = result._URI
    this._oneSetOfOneDoubles = result._oneSetOfOneDoubles
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneSetOfOneDoubles_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDoubles")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneSetOfOneDoubles = {
    _oneSetOfOneDoubles
  }

  def oneSetOfOneDoubles_= (value: Set[Double]) {
    _oneSetOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneSetOfOneDoubles") oneSetOfOneDoubles: Set[Double]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneSetOfOneDoubles = if (oneSetOfOneDoubles == null) Set.empty else oneSetOfOneDoubles)

}

object OneSetOfOneDoubles_2 extends AggregateRootCompanion[OneSetOfOneDoubles_2]{

  def apply(
    oneSetOfOneDoubles: Set[Double] = Set.empty
  ) = {
    require(oneSetOfOneDoubles ne null, "Null value was provided for property \"oneSetOfOneDoubles\"")
    new OneSetOfOneDoubles_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneSetOfOneDoubles = oneSetOfOneDoubles)
  }

}
