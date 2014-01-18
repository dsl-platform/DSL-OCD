package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneDate_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneDate: org.joda.time.LocalDate
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneDate_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneDate_2("+ URI +")"

   def copy(oneDate: org.joda.time.LocalDate = this._oneDate): OneDate_2 = {

  require(oneDate ne null, "Null value was provided for property \"oneDate\"")
    new OneDate_2(_URI = this.URI, __locator = this.__locator, _oneDate = oneDate)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneDate_2): this.type = {
    this._URI = result._URI
    this._oneDate = result._oneDate
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneDate_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneDate")
  def oneDate = {
    _oneDate
  }

  def oneDate_= (value: org.joda.time.LocalDate) {
    _oneDate = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneDate") oneDate: org.joda.time.LocalDate
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneDate = if (oneDate == null) org.joda.time.LocalDate.now else oneDate)

}

object OneDate_2 extends AggregateRootCompanion[OneDate_2]{

  def apply(
    oneDate: org.joda.time.LocalDate = org.joda.time.LocalDate.now
  ) = {
    require(oneDate ne null, "Null value was provided for property \"oneDate\"")
    new OneDate_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneDate = oneDate)
  }

}
